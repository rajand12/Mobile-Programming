package com.example.question6;

public class ContactItem {

        private String name;
        private String address;
        private String contact;
        private int age;

        public ContactItem(String name, String address, String contact, int age) {
            this.name = name;
            this.address = address;
            this.contact = contact;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getContact() {
            return contact;
        }

        public int getAge() {
            return age;
        }
    }
