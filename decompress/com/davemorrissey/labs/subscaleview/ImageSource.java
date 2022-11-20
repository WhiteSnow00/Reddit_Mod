// 
// Decompiled by Procyon v0.6.0
// 

package com.davemorrissey.labs.subscaleview;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.io.File;
import android.net.Uri;
import android.graphics.Rect;
import android.graphics.Bitmap;

public final class ImageSource
{
    public static final String ASSET_SCHEME = "file:///android_asset/";
    public static final String FILE_SCHEME = "file:///";
    private final Bitmap bitmap;
    private boolean cached;
    private final Integer resource;
    private int sHeight;
    private Rect sRegion;
    private int sWidth;
    private boolean tile;
    private final Uri uri;
    
    private ImageSource(final int n) {
        this.bitmap = null;
        this.uri = null;
        this.resource = n;
        this.tile = true;
    }
    
    private ImageSource(final Bitmap bitmap, final boolean cached) {
        this.bitmap = bitmap;
        this.uri = null;
        this.resource = null;
        this.tile = false;
        this.sWidth = bitmap.getWidth();
        this.sHeight = bitmap.getHeight();
        this.cached = cached;
    }
    
    private ImageSource(final Uri uri) {
        final String string = uri.toString();
        Uri parse = uri;
        while (true) {
            if (!string.startsWith("file:///")) {
                break Label_0051;
            }
            parse = uri;
            if (new File(string.substring(7)).exists()) {
                break Label_0051;
            }
            try {
                parse = Uri.parse(URLDecoder.decode(string, "UTF-8"));
                this.bitmap = null;
                this.uri = parse;
                this.resource = null;
                this.tile = true;
            }
            catch (final UnsupportedEncodingException ex) {
                parse = uri;
                continue;
            }
            break;
        }
    }
    
    public static ImageSource asset(final String s) {
        if (s != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("file:///android_asset/");
            sb.append(s);
            return uri(sb.toString());
        }
        throw new NullPointerException("Asset name must not be null");
    }
    
    public static ImageSource bitmap(final Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, false);
        }
        throw new NullPointerException("Bitmap must not be null");
    }
    
    public static ImageSource cachedBitmap(final Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, true);
        }
        throw new NullPointerException("Bitmap must not be null");
    }
    
    public static ImageSource resource(final int n) {
        return new ImageSource(n);
    }
    
    private void setInvariants() {
        final Rect sRegion = this.sRegion;
        if (sRegion != null) {
            this.tile = true;
            this.sWidth = sRegion.width();
            this.sHeight = this.sRegion.height();
        }
    }
    
    public static ImageSource uri(final Uri uri) {
        if (uri != null) {
            return new ImageSource(uri);
        }
        throw new NullPointerException("Uri must not be null");
    }
    
    public static ImageSource uri(final String s) {
        if (s != null) {
            String l = s;
            if (!s.contains("://")) {
                String substring = s;
                if (s.startsWith("/")) {
                    substring = s.substring(1);
                }
                l = b.l("file:///", substring);
            }
            return new ImageSource(Uri.parse(l));
        }
        throw new NullPointerException("Uri must not be null");
    }
    
    public ImageSource dimensions(final int sWidth, final int sHeight) {
        if (this.bitmap == null) {
            this.sWidth = sWidth;
            this.sHeight = sHeight;
        }
        this.setInvariants();
        return this;
    }
    
    public final Bitmap getBitmap() {
        return this.bitmap;
    }
    
    public final Integer getResource() {
        return this.resource;
    }
    
    public final int getSHeight() {
        return this.sHeight;
    }
    
    public final Rect getSRegion() {
        return this.sRegion;
    }
    
    public final int getSWidth() {
        return this.sWidth;
    }
    
    public final boolean getTile() {
        return this.tile;
    }
    
    public final Uri getUri() {
        return this.uri;
    }
    
    public final boolean isCached() {
        return this.cached;
    }
    
    public ImageSource region(final Rect sRegion) {
        this.sRegion = sRegion;
        this.setInvariants();
        return this;
    }
    
    public ImageSource tiling(final boolean tile) {
        this.tile = tile;
        return this;
    }
    
    public ImageSource tilingDisabled() {
        return this.tiling(false);
    }
    
    public ImageSource tilingEnabled() {
        return this.tiling(true);
    }
}
