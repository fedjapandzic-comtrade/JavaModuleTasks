package TaskBalloonAssignment;

public class Solution {

    public int solution(String S){
    int b = 0;
    int a = 0;
    int l = 0;
    int o = 0;
    int n = 0;
    char character;
        for(int i = 0 ; i < S.length() ; i++)
    {
        character = S.charAt(i);
        if(Character.compare(character,'B') == 0){
            b++;
        }
        else if(Character.compare(character,'A') == 0){
            a++;
        }
        else if(Character.compare(character,'L') == 0){
            l++;
        }
        else if(Character.compare(character,'O') == 0){
            o++;
        }
        else if(Character.compare(character,'N') == 0){
            n++;
        }
    }
    l = l/2;
    o = o/2;

        return Math.min(b , Math.min(a , Math.min(l, Math.min(o , n))));
}
}
