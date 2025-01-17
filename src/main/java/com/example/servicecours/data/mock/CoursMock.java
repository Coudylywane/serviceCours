package com.example.servicecours.data.mock;

import com.example.servicecours.data.entity.ClassRom;
import com.example.servicecours.data.entity.Cours;
import com.example.servicecours.data.enums.CoursStatus;
import com.example.servicecours.data.repository.ClassRoomRepository;
import com.example.servicecours.data.repository.CoursRepository;
import com.example.servicecours.services.impl.CoursService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Builder
@RequiredArgsConstructor
@Order(2)
public class CoursMock implements CommandLineRunner {
    private final CoursRepository coursRepository ;
    private final ClassRoomRepository classRoomRepository ;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            ClassRom classRoom = classRoomRepository.findById(Long.valueOf(i)).orElse(null);
            var build = Cours.builder()
                    .module("Module" + i)
                    .professor("Professor " + i)
                    .status(CoursStatus.STARTED)
                    .classRoom(classRoom)
                    .build();
            coursRepository.save(build) ;
        }
    }
}
