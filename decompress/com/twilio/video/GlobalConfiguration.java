// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.io.InputStream;
import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import android.content.Context;
import java.util.Properties;

class GlobalConfiguration
{
    public static final String DEFAULT_CONFIG_FILE = "twilio-video-config.properties";
    public static final String SYSPROP_GLOBAL_CONFIG_FILE = "com.twilio.video.Video.configPath";
    private static GlobalConfiguration _instance;
    private static final Logger _logger;
    private final Properties _configuration;
    
    static {
        _logger = Logger.getLogger((Class)GlobalConfiguration.class);
    }
    
    private GlobalConfiguration(final Context context) {
        final Properties configuration = new Properties(System.getProperties());
        this._configuration = configuration;
        final AssetManager assets = context.getAssets();
        try {
            final InputStream open = assets.open(System.getProperty("com.twilio.video.Video.configPath", "twilio-video-config.properties"));
            configuration.load(open);
            open.close();
        }
        catch (final Exception ex) {
            GlobalConfiguration._logger.e(a.k(ex, a.t("Global Configuration override file: com.twilio.video.Video.configPath failed to load. Error:")));
            ex.printStackTrace();
        }
        catch (final FileNotFoundException ex2) {
            GlobalConfiguration._logger.i("There is no Global Configuration override file: twilio-video-config.properties");
        }
    }
    
    public static GlobalConfiguration getInstance(final Context context) {
        if (GlobalConfiguration._instance == null) {
            GlobalConfiguration._instance = new GlobalConfiguration(context);
        }
        return GlobalConfiguration._instance;
    }
    
    public static void release() {
        GlobalConfiguration._instance = null;
    }
    
    public Properties getConfig() {
        return this._configuration;
    }
}
