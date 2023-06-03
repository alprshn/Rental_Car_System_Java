/**

@file CustomerObservable.java
@brief This file contains the implementation of the CustomerObservable class.
*/
package ce204_hw4_library;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @class CustomerObservable
 *
 * @brief Represents the observable subject that notifies car rent observers.
 */
public class CustomerObserverable {
  private List<CarRentObserverInterface> carRentObserverList;

  /**
   *
   * @brief Constructs a CustomerObservable object.
   */

  public void notifyObservers() {
    for (CarRentObserverInterface CarObserver : carRentObserverList) {
      CarObserver.updateNoti(this);
    }
  }

  /**
   *
   * @brief Constructs a CustomerObservable object.
   */
  public CustomerObserverable() {
    carRentObserverList = new ArrayList<>();
  }

  /**
   *
   * @brief Removes a car rent observer from the observer list.
   * @param carObserver The car rent observer to remove.
   */
  public void removeObserver(CarRentObserverInterface CarObserver) {
    carRentObserverList.remove(CarObserver);
  }

  /**
   *
   * @brief Adds a car rent observer to the observer list.
   * @param carObserver The car rent observer to add.
   */
  public void addObserver(CarRentObserverInterface CarObserver) {
    carRentObserverList.add(CarObserver);
  }

}
