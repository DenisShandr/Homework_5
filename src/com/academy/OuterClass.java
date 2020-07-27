package com.academy;

public class OuterClass<T> {
    protected T id;
    private String name;
    private InnerClass.DayOfWeek lastDay = InnerClass.DayOfWeek.SUNDAY;
    private InnerClass inner = new InnerClass(InnerClass.DayOfWeek.SATURDAY);

    public OuterClass(String name) {
        this.name = name;
    }

    public void outerMethod() {
        System.out.println("Outer method.");


    }

    public void outerInnerMethod() {
        System.out.println("Outer inner method.");
        InnerClass.DayOfWeek day = InnerClass.DayOfWeek.FRIDAY;
        System.out.println(day + " translation: "+ day.translation);
        System.out.println(inner.getOneDay() + " translation: " + inner.getOneDay().translation);
    }

    public void genericMethod(T element){
        this.id = element;
        System.out.println("ID of " + name + " is: " + id);
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Outer Class. " + "ID: " + id +
                ", name: " + name +
                ", lastDay: " + lastDay +
                ", inner field: " + inner.oneDay;
    }

    private static class InnerClass {
        private DayOfWeek oneDay;

        public InnerClass(DayOfWeek oneDay) {
            this.oneDay = oneDay;
        }

        public void setOneDay(DayOfWeek oneDay) {
            this.oneDay = oneDay;
        }

        public DayOfWeek getOneDay() {
            return oneDay;
        }

        public enum DayOfWeek {
            MONDAY("понедельник"),
            TUESDAY("вторник"),
            WEDNESDAY("среда"),
            THURSDAY("четверг"),
            FRIDAY("пятница"),
            SATURDAY("суббота"),
            SUNDAY("воскресенье");

            private String translation;

            DayOfWeek(String translation) {
                this.translation = translation;
            }

            public String getTranslation() {
                return translation;
            }
        }
    }
}
