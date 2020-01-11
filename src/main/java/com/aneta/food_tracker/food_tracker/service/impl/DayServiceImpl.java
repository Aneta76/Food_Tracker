package com.aneta.food_tracker.food_tracker.service.impl;

import com.aneta.food_tracker.food_tracker.entity.Day;
import com.aneta.food_tracker.food_tracker.repository.DayRepository;
import com.aneta.food_tracker.food_tracker.service.DayService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DayServiceImpl implements DayService {

    private final DayRepository dayRepository;

    public DayServiceImpl(DayRepository dayRepository) {
        this.dayRepository = dayRepository;
    }

    @Override
    public Day addDay(Day day) {
        return dayRepository.save(day);
    }

    @Override
    public Day getOne(Long id) {
        return dayRepository.findById(id).get();
    }

    @Override
    public List<Day> getAll() {
        Iterable<Day> allDays = dayRepository.findAll();
        List<Day> days = new ArrayList<>();
        for (Day d : allDays) {
            days.add(d);
        }
        return days;
    }

    @Override
    public Day updateProduct(Day day) {
        return dayRepository.save(day);
    }

    @Override
    public void delete(Long id) {
        dayRepository.deleteById(id);
    }
}
