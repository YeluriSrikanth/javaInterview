package InterviewQ;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class TwoListCompare {

    public static void main(String[] args) {
        List<User> userList = getUserList();
        List<UserMemo> userMemoList = getUsermemoList();
        Instant start = Instant.now();
//        for (User user : userList) {
//            for (UserMemo userMemo : userMemoList) {
//                if (user.getUserId() == userMemo.getUserId()) {
//                    String var=userMemo.getContent();
//                    System.out.println(var);
//                     break;
//                }
//
//            }
//
//
//        }
        Map<Long, String> map = userMemoList.stream().collect(Collectors.toMap(UserMemo::getUserId, UserMemo::getContent));
        Map<String,Object> dummyMap=userList.stream().collect(Collectors.toMap(user-> user.getName(),user->user));
        for(Map.Entry entry:dummyMap.entrySet()){
            System.out.println(entry.getValue().toString());


        }
        for (User user : userList) {
            if (map.get(user.getUserId()) != null) {
                //System.out.println(map.get(user.getUserId()));
            }

        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Execution time: " + duration.toMillis() + " milliseconds");

    }


    public static List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        for (int i = 1; i <= 50000; i++) {
            User user = new User();
            user.setUserId((long) i);
            user.setName(UUID.randomUUID().toString());
            userList.add(user);
        }
        return userList;

    }

    public static List<UserMemo> getUsermemoList() {
        List<UserMemo> userMemoList = new ArrayList<>();
        for (int i = 30000; i >= 1; i--) {
            UserMemo userMemo = new UserMemo();
            userMemo.setUserId((long) i);
            userMemo.setContent(UUID.randomUUID().toString());
            userMemoList.add(userMemo);

        }
        return userMemoList;

    }


}