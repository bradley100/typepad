package net.doepner.lang;


import net.doepner.event.ChangeListener;
import net.doepner.event.ChangePropagator;
import net.doepner.event.ChangeSupport;

public class EnglishOrGerman implements LanguageChanger {

    private final ChangePropagator<ILanguage> propagator =
        new ChangeSupport<>();

    private boolean deutsch;

    @Override
    public ILanguage getLanguage() {
        return deutsch ? Language.DEUTSCH : Language.ENGLISH;
    }

    @Override
    public void changeLanguage() {
        final ILanguage before = getLanguage();
        deutsch = !deutsch;
        final ILanguage after = getLanguage();
        propagator.handleChange(before, after);
    }

    @Override
    public void addListener(ChangeListener<ILanguage> listener) {
        propagator.addListener(listener);
    }
}
