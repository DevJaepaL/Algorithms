package Programmers_Lv0;

class Lv0_SlicePizza {
    public int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : n / slice + 1;
    }    
}
