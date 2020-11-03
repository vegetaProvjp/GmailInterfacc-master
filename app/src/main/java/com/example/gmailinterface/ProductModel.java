package com.example.gmailinterface;

public class ProductModel {
        String t_subject;
        String t_content;
        String t_name;
        String t_time;
        String t_icon;
        int color;
        public ProductModel(String t_subject, String t_content, String t_name, String t_time, String t_icon) {
            this.t_name = t_name;
            this.t_content = t_content;
            this.t_time = t_time;
            this.t_subject = t_subject;
            this.t_icon = t_icon;
            color = -1;
        }
        public String getName() {
            return t_name;
        }
        public String getSubject() {
            return t_subject;
        }
        public String getContent() {
            return t_content;
        }

        public String getTime() {
            return t_time;
        }
        public String getIcon() {return t_icon;}
        public int getColor() {
        return color;
        }

         public void setColor(int color) {
        this.color = color;
    }
}
