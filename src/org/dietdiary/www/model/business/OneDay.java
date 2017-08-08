package org.dietdiary.www.model.business;

import org.dietdiary.www.model.diet.DietOfTheDay;

/**
 * Created by 412 on 27.07.2017.
 */
public class OneDay {
    BlockOfTasks     morningBlockOfTasks  = new BlockOfTasks();
    BlockOfTasks     eveningBlockOfTasks  = new BlockOfTasks();

    BusinessOfTheDay businessOfTheDay     = new BusinessOfTheDay();

    DietOfTheDay     dietOfTheDay         = new DietOfTheDay();

    Notes            mainBusinessOfTheDay = new Notes();
    Notes            resultsOfTheDay      = new Notes();
    Notes            someIdeas            = new Notes();

    Metrics          metrics              = new Metrics();
}