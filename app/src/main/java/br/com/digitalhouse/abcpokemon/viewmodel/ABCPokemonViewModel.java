package br.com.digitalhouse.abcpokemon.viewmodel;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import java.util.List;

import br.com.digitalhouse.abcpokemon.model.PokemonResponses;
import br.com.digitalhouse.abcpokemon.repository.ABCPokemonRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class ABCPokemonViewModel {

    private MutableLiveData<List<PokemonResponses>> resultLiveData = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private ABCPokemonRepository repository = new ABCPokemonRepository();



    public LiveData<List<PokemonResponses>> getResultLiveData() {
        return resultLiveData;
    }




}
