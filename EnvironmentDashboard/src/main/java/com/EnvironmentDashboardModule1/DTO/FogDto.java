package com.EnvironmentDashboardModule1.DTO;


import com.EnvironmentDashboardModule1.DTO.Interfaces.FogInterfaces.*;


import java.util.Date;

/**
 * Created by Andrei Sfarghiu on 5/13/2017.
 */
public class FogDto extends CreatingFogDto{
        private Long id;

    protected FogDto() {};

    public static class Builder implements IName, IDescription, IEndingDate, IHints, IRadius, ISeverity, IStartingDate, ILatitude, ILongitude,ITemperature, IHumidity, IPrecipitationLevel {
        private FogDto fogDto = new FogDto();


        @Override
        public IHumidity temperature(Integer temperature) {
            fogDto.temperature=temperature;
            return this;
        }

        @Override
        public FogDto humidity(Integer humidity) {

            fogDto.humidity=humidity;
            return fogDto;
        }

        @Override
        public ITemperature precipitationLevel(Integer precipitationLevel) {

            fogDto.precipitationLevel=precipitationLevel;
            return this;
        }

        @Override
        public IRadius hints(String hints) {
            fogDto.hints=hints;
            return this;
        }

        @Override
        public ILatitude name(String name) {
            fogDto.name=name;
            return this;
        }

        @Override
        public IHints description(String description) {
            fogDto.description=description;
            return this;
        }

        @Override
        public ILongitude latitude(Double latitude) {
            fogDto.latitude=latitude;
            return this;
        }

        @Override
        public IDescription severity(String severity) {
            fogDto.severity=severity;
            return this;
        }

        @Override
        public IStartingDate longitude(Double longitude) {
            fogDto.longitude=longitude;
            return this;
        }

        @Override
        public ISeverity endingDate(Date endingDate) {
            fogDto.endingDate=endingDate;
            return this;
        }

        @Override
        public IEndingDate startingDate(Date startingDate) {
            fogDto.startingDate=startingDate;
            return this;
        }

        @Override
        public IPrecipitationLevel radius(Double radius) {
            fogDto.radius=radius;
            return this;
        }
    }
}