package ru.gb.inmemory;

public interface IModelChanger {
    /**
     * Произошло изменение в хранилище моделей
     */
    void notifyChange();

    void RegisterModelChanger(IModelChangedObserver o);

    void RemoveModelChanger(IModelChangedObserver o);
}
