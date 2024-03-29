package com.github.neapovil.latencyhud;

import com.github.neapovil.latencyhud.screen.PositionScreen;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public final class ModMenuIntegration implements ModMenuApi
{
    public ConfigScreenFactory<?> getModConfigScreenFactory()
    {
        return parent -> new PositionScreen(parent);
    }
}
