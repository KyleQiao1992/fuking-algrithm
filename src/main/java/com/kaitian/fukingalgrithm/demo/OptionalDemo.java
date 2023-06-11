package com.kaitian.fukingalgrithm.demo;

import lombok.Data;

import java.util.Optional;

public class OptionalDemo {
    //============================ class start ====================================//
    @Data
    public class Person {
        private Car car;

        public Car getCar() {
            return car;
        }
    }

    @Data
    public class Car {
        private Insurance insurance;

        public Insurance getInsurance() {
            return insurance;
        }
    }

    @Data
    public class Insurance {
        private String name;

        public String getName() {
            return name;
        }
    }

    //============================ class end ====================================//
    public String getCarInsuranceName(Person person) {
        return person.getCar().getInsurance().getName();
    }

    //null-安全的第一种尝试:深层质疑
    //原因是它不断地重复着一种模式，同时还牺牲了代码的可读性
    //不具备拓展性，
    public String getCarInsuranceName2(Person person) {
        if (person != null) {
            Car car = person.getCar();
            if (car != null) {
                Insurance insurance = car.getInsurance();
                if (insurance != null) {
                    return insurance.getName();
                }
            }
        }
        return "Unknown";
    }

    //null-安全的第二种尝试:过度的退出语句
    //
    public String getCarInsuranceName3(Person person) {
        if (person == null) {
            return "Unknown";
        }
        Car car = person.getCar();
        if (car == null) {
            return "Unknown";
        }
        Insurance insurance = car.getInsurance();
        if (insurance == null) {
            return "Unknown";
        }
        return insurance.getName();
    }

    //******************************** 改造 ********************************

    @Data
    public class Person2 {
        private Optional<Car2> car;

        public Optional<Car2> getCar() {
            return car;
        }
    }

    @Data
    public class Car2 {
        private Optional<Insurance2> insurance;

        public Optional<Insurance2> getInsurance() {
            return insurance;
        }
    }

    @Data
    public class Insurance2 {
        private String name;

        public String getName() {
            return name;
        }
    }

    public String getCarInsuranceName3(Optional<Person2> person) {
        return person.flatMap(Person2::getCar)
                .flatMap(Car2::getInsurance)
                .map(Insurance2::getName)
                .orElse("Unknown");
    }
}
