package br.com.digitalhouse.abcpokemon.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.List;

import br.com.digitalhouse.abcpokemon.model.PokemonResponses;
import br.com.digitalhouse.abcpokemon.repository.ABCPokemonRepository;
import io.reactivex.disposables.CompositeDisposable;

public class ABCPokemonViewModel {

    private MutableLiveData<List<PokemonResponses>> resultLiveData = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private ABCPokemonRepository repository = new ABCPokemonRepository();



    public LiveData<List<PokemonResponses>> getResultLiveData() {
        return resultLiveData;
    }




}
