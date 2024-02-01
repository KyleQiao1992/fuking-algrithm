package com.kaitian.fukingalgrithm.heap.no1845_Seat_Reservation_Manager;

import java.util.PriorityQueue;

public class Solution {

    class SeatManager {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return a - b;
        });

        public SeatManager(int n) {
            for (int i = 1; i <= n; i++) {
                pq.offer(i);
            }
        }

        public int reserve() {
            return pq.poll();
        }

        public void unreserve(int seatNumber) {
            pq.offer(seatNumber);
        }
    }
}
