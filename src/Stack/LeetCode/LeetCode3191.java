package Stack.LeetCode;

import java.util.Arrays;

public class LeetCode3191 {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,0,1,0,1,1,0,0,0,0,0};
        int fst=0;
        int sec=fst+1;
        int trd=sec+1;
        int count=0;
        while (arr[fst] != 0) {
            fst++;
            sec = fst+1;
            trd = sec+1;
        }
        while (trd < arr.length) {
            if (arr[fst] != 0 && (arr[fst] == arr[sec] && arr[sec] == arr[trd])) {
                    fst = trd+1;
                    sec = fst+1;
                    trd = sec+1;
            } else if ((arr[fst] == arr[sec] && arr[trd] != arr[sec]) || (arr[sec] == arr[trd] && arr[trd] != arr[fst])) {
                if (arr[sec] == 0 && arr[fst] == 0) {
                        arr[fst] = 1;
                        arr[sec] = 1;
                        arr[trd] = 0;
                        fst = sec+1;
                        sec = fst+1;
                        trd = sec+1;
                    } else if (arr[sec] == 1 && arr[fst] == 1){
                        arr[fst] = 0;
                        arr[sec] = 0;
                        arr[trd] = 1;
                    } else if (arr[sec] == 0 && arr[fst] != 0) {
                        arr[fst] = 0;
                        arr[sec] = 1;
                        arr[trd] = 1;
                    } else {
                        arr[fst] = 1;
                        arr[sec] = 0;
                        arr[trd] = 0;
                        fst++;
                        sec = fst+1;
                        trd = sec+1;
                    }
            } else if (arr[fst] == arr[trd] && arr[sec] != arr[fst]) {
                if (arr[sec] == 0) {
                    arr[fst] = 0;
                    arr[sec] = 1;
                    arr[trd] = 0;
                } else {
                    arr[fst] = 1;
                    arr[sec] = 0;
                    arr[trd] = 1;
                    fst++;
                    sec = fst+1;
                    trd = sec+1;
                }
            } else {
                arr[fst] = 1;
                arr[sec] = 1;
                arr[trd] = 1;
                fst = trd+1;
                sec = fst+1;
                trd = sec+1;
            }
            if ((fst < arr.length && !(arr[fst] == 0 && arr[sec] == 0 && arr[trd] == 0))) {
                if (trd == arr.length-1 && (arr[fst] == 0 || arr[sec] == 0 || arr[trd] == 0)) {
                    System.out.println("-1");
                    return;
                } else if (sec == arr.length-1 && (arr[fst] == 0 || arr[sec] == 0)) {
                    System.out.println("-1");
                    return;
                } else if (fst == arr.length-1 && arr[fst] == 0) {
                    System.out.println("-1");
                    return;
                }
            }
            while (trd < arr.length && arr[fst] != 0) {
                fst++;
                sec = fst+1;
                trd = sec+1;
            }
            count++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);

//        while (trd < arr.length) {
//            if ((arr[fst] == arr[sec] && arr[sec] == arr[trd]) && arr[fst] == arr[fst-1]) {
//                fst = trd+1;
//                sec = fst+1;
//                trd = sec+1;
//            } else if ((arr[fst] == arr[sec] && arr[sec] == arr[trd]) && arr[fst] != arr[fst-1]) {
//                if (arr[fst] == 0) {
//                    arr[fst] = 1;
//                    arr[sec] = 1;
//                    arr[trd] = 1;
//                } else {
//                    arr[fst] = 0;
//                    arr[sec] = 0;
//                    arr[trd] = 0;
//                }
//            }
//            else if (arr[fst] == arr[sec] && arr[sec] == arr[fst-1]) {
//                fst = sec+1;
//                sec = fst+1;
//                trd = sec+1;
//            } else {
//                if (arr[fst] != arr[fst-1]) {
//                    if (arr[fst] == 0 && arr[trd] == 1 && arr[fst] != arr[sec]) {
//                        arr[fst] = 1;
//                        arr[sec] = 0;
//                        arr[trd] = 0;
//                    } else if (arr[fst] == 1 && arr[trd] == 0 && arr[fst] != arr[sec]){
//                        arr[fst] = 0;
//                        arr[sec] = 1;
//                        arr[trd] = 1;
//                    } else {
//                        if (arr[fst] == 0) {
//                            arr[fst] = 1;
//                            arr[sec] = 1;
//                            arr[trd] = 0;
//                        } else {
//                            arr[fst] = 0;
//                            arr[sec] = 0;
//                            arr[trd] = 1;
//                        }
//                    }
//                } else {
//                    fst++;
//                    sec=fst+1;
//                    trd=sec+1;
//                }
//            }
//            if (trd == arr.length-1) {
//                if (!((arr[fst] == arr[sec] && arr[sec] == arr[trd]) && arr[fst] == arr[fst-1])) {
//                    System.out.println("-1");
//                    return;
//                }
//            } else if (sec == arr.length-1) {
//                if (!(arr[fst] == arr[sec] && arr[fst] == arr[fst-1])) {
//                    System.out.println("-1");
//                    return;
//                }
//            } else {
//                if (!(arr[fst] == arr[fst-1])) {
//                    System.out.println("-1");
//                    return;
//                }
//            }
//            count++;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(count);
    }
}
