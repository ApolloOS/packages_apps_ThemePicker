package com.android.customization.testing;

import com.android.customization.model.color.ColorOption;
import com.android.customization.model.grid.GridOption;
import com.android.customization.model.theme.ThemeBundle;
import com.android.customization.module.ThemesUserEventLogger;
import com.android.wallpaper.testing.TestUserEventLogger;

/**
 * Test implementation of {@link ThemesUserEventLogger}.
 */
public class TestThemesUserEventLogger extends TestUserEventLogger
        implements ThemesUserEventLogger {
    @Override
    public void logThemeSelected(ThemeBundle theme, boolean isCustomTheme) {
        // Do nothing.
    }

    @Override
    public void logThemeApplied(ThemeBundle theme, boolean isCustomTheme) {
        // Do nothing.
    }

    @Override
    public void logColorApplied(int action, ColorOption colorOption) {
        // Do nothing.
    }

    @Override
    public void logGridSelected(GridOption grid) {
        // Do nothing.
    }

    @Override
    public void logGridApplied(GridOption grid) {
        // Do nothing.
    }
}
