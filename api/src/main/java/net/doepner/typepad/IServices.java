package net.doepner.typepad;

import net.doepner.speech.Speaker;
import net.doepner.ui.ImageMap;

/**
 * Application services interface
 */
public interface IServices {

    Speaker getSpeaker();

    void saveBuffer(IModel model);

    ImageMap getImageMap();

    void loadBuffer(IModel model);
}
