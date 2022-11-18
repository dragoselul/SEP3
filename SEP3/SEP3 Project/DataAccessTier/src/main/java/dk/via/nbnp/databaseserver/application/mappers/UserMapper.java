package dk.via.nbnp.databaseserver.application.mappers;

import dk.via.nbnp.databaseserver.protobuf.User;

public abstract class UserMapper {

    public static User mapDomainToProto(dk.via.nbnp.databaseserver.domain.User user){
        return User.newBuilder()
                .setId(user.getId())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setPassword(user.getPassword())
                .setEmail(user.getEmail())
                .setPhoneNumber(user.getPhoneNumber())
                .setGender(user.isGender())
                .setDateOfRegistration(LocalDateMapper.mapDomainToProto(user.getDateOfRegistration()))
                .build();
    }

}
