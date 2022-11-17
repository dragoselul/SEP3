package dk.via.nbnp.databaseserver.application.mappers;

import dk.via.nbnp.databaseserver.protobuf.LocalDateTime;

public abstract class LocalDateMapper {

    public static LocalDateTime mapDomainToProto(java.time.LocalDateTime localDateTime){
        return LocalDateTime.newBuilder()
                .setYear(localDateTime.getYear())
                .setMonth(localDateTime.getMonthValue())
                .setDay(localDateTime.getDayOfMonth())
                .setHour(localDateTime.getHour())
                .setMinute(localDateTime.getMinute())
                .build();
    }

}
