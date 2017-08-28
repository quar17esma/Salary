package com.sergii.shutyi.model.service.employee.sorter.comparator;

import com.sergii.shutyi.model.entity.employee.IEmployee;

import java.util.Comparator;

public class EmployeeComparator {

    public static Comparator<IEmployee> SORT_BY_FIO = new Comparator<IEmployee>() {
        @Override
        public int compare(IEmployee e1, IEmployee e2) {
            return e1.getFio().compareToIgnoreCase(e2.getFio());
        }
    };

    public static Comparator<IEmployee> SORT_BY_HIRED_DATE = new Comparator<IEmployee>() {
        @Override
        public int compare(IEmployee e1, IEmployee e2) {
            return e1.getHiredDate().compareTo(e2.getHiredDate());
        }
    };
}
