    public String currentDateTime (){
        long timestamp1 = System.currentTimeMillis() /1000;
        LocalDateTime datatime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp1));
        return date;
    }
