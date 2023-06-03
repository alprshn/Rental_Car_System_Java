/**

@file NotificationTime.java
@brief This file contains the implementation of the NotificationTime class.
*/
package ce204_hw4_library;

/**
 *
 * @class NotificationTime
 *
 * @brief Represents a class that manages notification times for a customer.
 */
public class NotificationTime extends CustomerObserverable {
  private int remainingNoti;
  private int reservationNoti;

  /**
   *
   * @brief Gets the remaining notification time.
   * @return The remaining notification time.
   */
  public int getRemainingNoti() {
    return remainingNoti;
  }

  /**
   *
   * @brief Sets the remaining notification time.
   * @param remainingTime The remaining notification time to set.
   */
  public void setRemainingNoti(int remainingTime) {
    this.remainingNoti = remainingTime;

    if (remainingTime == 0) {
    } else {
      System.out.println(remainingTime);
    }

    checkRemainingNoti();
  }

  /**
   *
   * @brief Checks the remaining notification time and takes appropriate actions.
   */
  private void checkRemainingNoti() {
    if (remainingNoti == 0) {
      System.out.println("Your car is ready. You can rent your car.");
    } else if (remainingNoti - reservationNoti == 0) {
      notifyObservers();
    }
  }

  /**
   *
   * @brief Constructs a NotificationTime object.
   * @param remainingNoti   The remaining notification time.
   * @param reservationNoti The reservation notification time.
   */
  public NotificationTime(int remainingNoti, int reservationNoti) {
    this.remainingNoti = remainingNoti;
    this.reservationNoti = reservationNoti;
  }
}
