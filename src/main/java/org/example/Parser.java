package org.example;

public class Parser {
    private static String topic;
    private static int records = 0, recordSize = 0;
    private static String broker;
    Parser(String[] args){
        for(int i = 0; i<args.length;i++){
            switch (args[i]) {
                case "--brokers":
                    broker = args[++i];
                    break;
                case "--topic":
                    topic = args[++i];
                    break;
                case "--records":
                    records = Integer.parseInt(args[++i]);
                    break;
                case "--recordSize":
                    recordSize = Integer.parseInt(args[++i]);
                    break;
            }
        }
    }
    public static String getTopic(){
        return topic;
    }
    public static String getBroker(){
        return broker;
    }
    public static int getRecords(){
        return records;
    }
    public static int getRecordSize(){
        return recordSize;
    }
}
