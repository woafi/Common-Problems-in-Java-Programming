import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class ali {
    public static int cnt = 0;

    public void set() {
        cnt++;
    }

    public void get() {
        System.out.println(cnt);
    }
}

public class test2 {
    public static void main(String[] args) {
        ali a1 = new ali();
        ali a2 = new ali();
        a2.set();
        a1.set();
        a1.set();
        a1.get();
    }
}