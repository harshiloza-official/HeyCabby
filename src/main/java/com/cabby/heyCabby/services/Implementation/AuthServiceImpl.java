package com.cabby.heyCabby.services.Implementation;

import com.cabby.heyCabby.dto.CabbyDto;
import com.cabby.heyCabby.dto.SignUpDto;
import com.cabby.heyCabby.dto.UserDto;
import com.cabby.heyCabby.entities.Passenger;
import com.cabby.heyCabby.entities.User;
import com.cabby.heyCabby.entities.enums.Role;
import com.cabby.heyCabby.exceptions.RuntimeConflictException;
import com.cabby.heyCabby.repositories.UserRepository;
import com.cabby.heyCabby.services.AuthService;
import com.cabby.heyCabby.services.PassengerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class AuthServiceImpl implements AuthService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final PassengerService passengerService;

    public AuthServiceImpl(ModelMapper modelMapper, UserRepository userRepository, PassengerService passengerService) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.passengerService = passengerService;
    }

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signUp(SignUpDto signUpDto) {
       User user = userRepository.findByEmail(signUpDto.getEmail()).orElse(null);
       if(user != null)
           throw new RuntimeConflictException ("Cannot SignUp, User already exists with email "+signUpDto.getEmail());

        User mappedUser = modelMapper.map(signUpDto, User.class);
        mappedUser.setRoles(Set.of(Role.PASSENGER));
        User savedUser = userRepository.save(mappedUser);

        passengerService.createNewPassenger(savedUser);
        // Need to implement WALLET related service here
        return modelMapper.map(savedUser, UserDto.class);

    }

    @Override
    public CabbyDto onboardNewCabby(Long userId) {
        return null;
    }
}
