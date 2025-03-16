import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // HashMap을 생성하여 참가자 명단을 저장
        HashMap<String, Integer> participantMap = new HashMap<>();
        
        // 참가자 명단을 HashMap에 넣어 +1 증가시킴
        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }

        // 완주자의 이름을 하나씩 감소시킴
        for (String name : completion) {
            participantMap.put(name, participantMap.get(name) - 1);
        }

        // 값이 0이 아닌 이름을 찾아 반환
        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) > 0) {
                return key;
            }
        }

        return ""; // 이 코드는 실행되지 않음 (항상 1명은 완주하지 못하므로)
    }
}
