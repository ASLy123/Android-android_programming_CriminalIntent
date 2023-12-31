package com.bignerdranch.example.criminalintent

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel




class CrimeListViewModel : ViewModel() {
    //    val crimes = mutableListOf<Crime>()
//    init {
//        for (i in 0 until 100) {
//            val crime = Crime()
//            crime.title = "Crime #$i"
//            crime.isSolved = i and 1 == 0
//            crimes.add(crime) //crimes += crime
//        }
//    }
    private val crimeRepository = CrimeRepository.get()

    //    val crimes = crimeRepository.getCrimes()
    val crimeListLiveData = crimeRepository.getCrimes()
    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }

    val isEmptyDatabase: LiveData<Boolean> = crimeRepository.isNotEmpty()

    fun deleteAll(){
        crimeRepository.deleteAll()
    }
}