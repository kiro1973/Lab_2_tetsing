public class Watch {

    int m = 0;
    int h = 0;
    int D = 1;
    int M = 1;
    int Y = 2000;
    public Watch()
    {

    }
         public String watch(String buttons) {
            int length = buttons.length();
            String state = "Normal_Display";
            String state_in_normalDisplay = "Time";
            String state_in_Chime_Alarm_Set = "Alarm";
            String state_in_Update = "min";

            for(int i = 0; i < length; ++i) {
                switch (state) {
                    case "Normal_Display":
                        if (buttons.charAt(i) == 'c') {
                            state = "Update";
                        }

                        if (buttons.charAt(i) == 'b') {
                            state = "Chime_Alarm_Set";
                        }

                        if (buttons.charAt(i) == 'a') {
                            if (state_in_normalDisplay == "Time") {
                                state_in_normalDisplay = "Date";
                            } else {
                                state_in_normalDisplay = "Time";
                            }
                        }
                        break;
                    case "Chime_Alarm_Set":
                        if (buttons.charAt(i) == 'a' && state_in_Chime_Alarm_Set == "Alarm") {
                            state_in_Chime_Alarm_Set = "Chime";
                        }

                        if (buttons.charAt(i) == 'd') {
                            state = "Normal_Display";
                        }
                        break;
                    case "Update":
                        if (buttons.charAt(i) == 'a') {
                            if (state_in_Update == "min") {
                                state_in_Update = "hour";
                            } else if (state_in_Update == "hour") {
                                state_in_Update = "day";
                            } else if (state_in_Update == "day") {
                                state_in_Update = "month";
                            } else if (state_in_Update == "month") {
                                state_in_Update = "year";
                            } else if (state_in_Update == "year") {
                                state = "Normal_Display";
                            }
                        }

                        if (buttons.charAt(i) == 'b') {
                            if (state_in_Update == "min") {
                                if (m < 60) {
                                    ++m;
                                } else {
                                    m = 0;
                                }
                            } else if (state_in_Update == "hour") {
                                if (h < 24) {
                                    ++h;
                                } else {
                                    h = 0;
                                }
                            } else if (state_in_Update == "day") {
                                if (D < 31) {
                                    ++D;
                                } else {
                                    D = 1;
                                }
                            } else if (state_in_Update == "month") {
                                if (M < 12) {
                                    ++M;
                                } else {
                                    M = 1;
                                }
                            } else if (state_in_Update == "year" && Y < 2022) {
                                ++Y;
                            }
                        }

                        if (buttons.charAt(i) == 'd') {
                            state = "Normal_Display";
                        }
                }
            }

            String s;
            if (state == "Normal_Display") {
                s = state_in_normalDisplay;
            } else if (state == "Chime_Alarm_Set") {
                s = state_in_Chime_Alarm_Set;
            } else {
                s = state_in_Update;
            }

            return "Current state: " + state + ",current inner state: " + s + " , Date: " + String.valueOf(D) + "/" + String.valueOf(M) + "/" + String.valueOf(Y) + "  Time: " + String.format("%02d", h) + ":" + String.format("%02d", m);
        }
    }


