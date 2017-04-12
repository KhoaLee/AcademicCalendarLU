/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiccalendar.ui.main;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Karis
 */
public class Calendar {
        private final SimpleStringProperty name;
        private final SimpleStringProperty startYear;
        private final SimpleStringProperty endYear;
         
        public Calendar(String name, String startYear, String endYear) {
            this.name = new SimpleStringProperty(name);
            this.startYear = new SimpleStringProperty(startYear);
            this.endYear = new SimpleStringProperty(endYear);
        }
         
        public String getName() {
            return name.get();
        }

        public String getStartYear() {
            return startYear.get();
        }

        public String getEndYear() {
            return endYear.get();
        }
    }
