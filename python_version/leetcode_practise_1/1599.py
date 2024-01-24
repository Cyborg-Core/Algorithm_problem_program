from typing import List


class Solution:
    def minOperationsMaxProfit(self, customers: List[int], boardingCost: int, runningCost: int) -> int:
        current_customer_count = 0
        record_money = 0
        most = 0
        i = 0
        most_round = -1
        for c in customers:
            current_customer_count += c
            i += 1
            this_round = min(current_customer_count, 4)
            current_customer_count -= this_round
            record_money += boardingCost * this_round - runningCost
            print(record_money)
            if most < record_money:
                most = record_money
                most_round = i
        while current_customer_count != 0:
            i += 1
            this_round = min(current_customer_count, 4)
            current_customer_count -= this_round
            record_money += boardingCost * this_round - runningCost

            if most < record_money:
                most = record_money
                most_round = i
        return most_round


if __name__ == '__main__':
    customers = [2]
    boardingCost =2
    runningCost = 4
    print(Solution().minOperationsMaxProfit(customers, boardingCost, runningCost))
