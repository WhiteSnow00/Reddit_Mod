// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import android.os.Build$VERSION;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import com.twitter.sdk.android.core.Logger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStoreImpl;
import android.content.Context;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class IdManager
{
    public static final String ADVERTISING_PREFERENCES = "com.twitter.sdk.android.AdvertisingPreferences";
    public static final String COLLECT_IDENTIFIERS_ENABLED = "com.twitter.sdk.android.COLLECT_IDENTIFIERS_ENABLED";
    private static final String FORWARD_SLASH_REGEX;
    private static final Pattern ID_PATTERN;
    public static final String PREFKEY_INSTALLATION_UUID = "installation_uuid";
    public AdvertisingInfo advertisingInfo;
    public AdvertisingInfoProvider advertisingInfoProvider;
    private final String appIdentifier;
    private final boolean collectHardwareIds;
    public boolean fetchedAdvertisingInfo;
    private final ReentrantLock installationIdLock;
    private final PreferenceStore preferenceStore;
    
    static {
        ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
        FORWARD_SLASH_REGEX = Pattern.quote("/");
    }
    
    public IdManager(final Context context) {
        this(context, (PreferenceStore)new PreferenceStoreImpl(context, "com.twitter.sdk.android.AdvertisingPreferences"));
    }
    
    public IdManager(final Context context, final PreferenceStore preferenceStore) {
        this(context, preferenceStore, new AdvertisingInfoProvider(context, preferenceStore));
    }
    
    public IdManager(final Context context, final PreferenceStore preferenceStore, final AdvertisingInfoProvider advertisingInfoProvider) {
        this.installationIdLock = new ReentrantLock();
        if (context != null) {
            this.appIdentifier = context.getPackageName();
            this.advertisingInfoProvider = advertisingInfoProvider;
            this.preferenceStore = preferenceStore;
            if (!(this.collectHardwareIds = CommonUtils.getBooleanResourceValue(context, "com.twitter.sdk.android.COLLECT_IDENTIFIERS_ENABLED", true))) {
                final Logger logger = Twitter.getLogger();
                final StringBuilder r = a.r("Device ID collection disabled for ");
                r.append(context.getPackageName());
                logger.d("Twitter", r.toString());
            }
            return;
        }
        throw new IllegalArgumentException("appContext must not be null");
    }
    
    private String createInstallationUUID() {
        this.installationIdLock.lock();
        try {
            String s;
            if ((s = this.preferenceStore.get().getString("installation_uuid", (String)null)) == null) {
                s = this.formatId(UUID.randomUUID().toString());
                final PreferenceStore preferenceStore = this.preferenceStore;
                preferenceStore.save(preferenceStore.edit().putString("installation_uuid", s));
            }
            return s;
        }
        finally {
            this.installationIdLock.unlock();
        }
    }
    
    private String formatId(String lowerCase) {
        if (lowerCase == null) {
            lowerCase = null;
        }
        else {
            lowerCase = IdManager.ID_PATTERN.matcher(lowerCase).replaceAll("").toLowerCase(Locale.US);
        }
        return lowerCase;
    }
    
    private String removeForwardSlashesIn(final String s) {
        return s.replaceAll(IdManager.FORWARD_SLASH_REGEX, "");
    }
    
    public String getAdvertisingId() {
        if (this.collectHardwareIds) {
            final AdvertisingInfo advertisingInfo = this.getAdvertisingInfo();
            if (advertisingInfo != null) {
                return advertisingInfo.advertisingId;
            }
        }
        return null;
    }
    
    public AdvertisingInfo getAdvertisingInfo() {
        synchronized (this) {
            if (!this.fetchedAdvertisingInfo) {
                this.advertisingInfo = this.advertisingInfoProvider.getAdvertisingInfo();
                this.fetchedAdvertisingInfo = true;
            }
            return this.advertisingInfo;
        }
    }
    
    public String getAppIdentifier() {
        return this.appIdentifier;
    }
    
    public String getDeviceUUID() {
        String s;
        if (this.collectHardwareIds) {
            if ((s = this.preferenceStore.get().getString("installation_uuid", (String)null)) == null) {
                s = this.createInstallationUUID();
            }
        }
        else {
            s = "";
        }
        return s;
    }
    
    public String getModelName() {
        return String.format(Locale.US, "%s/%s", this.removeForwardSlashesIn(Build.MANUFACTURER), this.removeForwardSlashesIn(Build.MODEL));
    }
    
    public String getOsBuildVersionString() {
        return this.removeForwardSlashesIn(Build$VERSION.INCREMENTAL);
    }
    
    public String getOsDisplayVersionString() {
        return this.removeForwardSlashesIn(Build$VERSION.RELEASE);
    }
    
    public String getOsVersionString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getOsDisplayVersionString());
        sb.append("/");
        sb.append(this.getOsBuildVersionString());
        return sb.toString();
    }
    
    public Boolean isLimitAdTrackingEnabled() {
        if (this.collectHardwareIds) {
            final AdvertisingInfo advertisingInfo = this.getAdvertisingInfo();
            if (advertisingInfo != null) {
                return advertisingInfo.limitAdTrackingEnabled;
            }
        }
        return null;
    }
}
