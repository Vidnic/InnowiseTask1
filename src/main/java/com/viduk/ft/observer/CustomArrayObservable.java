package com.viduk.ft.observer;

import com.viduk.ft.exсeption.CustomArrayException;

public interface CustomArrayObservable {
	void addObserver(CustomArrayObserver observer) throws CustomArrayException;
  void removeObserver();
  void notifyObservers();
}
