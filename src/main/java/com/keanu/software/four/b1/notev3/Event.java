package com.keanu.software.four.b1.notev3;

enum Event {
        BACK_SLASH("backSlash","\\"),
        DOUBLE_QUOTATION("doubleQuotation", "\""),
        OTHER_CHAR("other","*");

        private final String name;
        private final String value;

        Event(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static Event of(String name) {
            if (BACK_SLASH.value.equals(name)) {
                return BACK_SLASH;
            } else if (DOUBLE_QUOTATION.value.equals(name)) {
                return DOUBLE_QUOTATION;
            } else {
                return OTHER_CHAR;
            }
        }
    }
