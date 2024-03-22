package com.example.hw3;

import com.google.gson.annotations.SerializedName;


public class Grade {

        @SerializedName("name")
        private String name;// name of the student

        @SerializedName("category")
        private String category;// category of the grade

        @SerializedName("score")
        private int score;// score of the student

    /**
     * This is the constructor for the Grade class
     * @param name
     * @param category
     * @param score
     */
        public Grade(String name , String category , int score){
            this.name = name;
            this.category = category;
            this.score = score;
        }

        //getters and setters for the name, category and score
        public void setName(String name){
            this.name = name;
        }
        public void setCategory(String category) {
            this.category = category;
        }
        public void setScore(int score) {
            this.score = score;
        }
        public String getName() {
            return name;
        }
        public String getCategory() {
            return category;
        }
        public int getScore() {
            return score;
        }


    }


