package thymeleaf.test.testthymeleaf.services;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import thymeleaf.test.testthymeleaf.model.entities.User;
import thymeleaf.test.testthymeleaf.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ShopingUserDetailsService implements UserDetailsService {
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository
                .findUserByUsername(username).
                        orElseThrow(() -> new UsernameNotFoundException("User with name " + username + " was not found!"));
        //temporarily
        return null;
    }
    private UserDetails mapToUserDetails(User userEntity) {
        List<GrantedAuthority> authorities =
                userEntity.
                        getUserRoles().
                        stream().
                        //r.getRole()
                        map(r -> new SimpleGrantedAuthority()).
                        collect(Collectors.toList());

        return new org.springframework.security.core.userdetails.User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                authorities
        );
    }
}
