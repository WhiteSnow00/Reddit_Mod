// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import java.util.List;
import ij.a;
import java.io.Serializable;

public class User implements Serializable, Identifiable
{
    public static final long INVALID_ID = -1L;
    private static final long serialVersionUID = 4663450696842173958L;
    @a("contributors_enabled")
    public final boolean contributorsEnabled;
    @a("created_at")
    public final String createdAt;
    @a("default_profile")
    public final boolean defaultProfile;
    @a("default_profile_image")
    public final boolean defaultProfileImage;
    @a("description")
    public final String description;
    @a("email")
    public final String email;
    @a("entities")
    public final UserEntities entities;
    @a("favourites_count")
    public final int favouritesCount;
    @a("follow_request_sent")
    public final boolean followRequestSent;
    @a("followers_count")
    public final int followersCount;
    @a("friends_count")
    public final int friendsCount;
    @a("geo_enabled")
    public final boolean geoEnabled;
    @a("id")
    public final long id;
    @a("id_str")
    public final String idStr;
    @a("is_translator")
    public final boolean isTranslator;
    @a("lang")
    public final String lang;
    @a("listed_count")
    public final int listedCount;
    @a("location")
    public final String location;
    @a("name")
    public final String name;
    @a("profile_background_color")
    public final String profileBackgroundColor;
    @a("profile_background_image_url")
    public final String profileBackgroundImageUrl;
    @a("profile_background_image_url_https")
    public final String profileBackgroundImageUrlHttps;
    @a("profile_background_tile")
    public final boolean profileBackgroundTile;
    @a("profile_banner_url")
    public final String profileBannerUrl;
    @a("profile_image_url")
    public final String profileImageUrl;
    @a("profile_image_url_https")
    public final String profileImageUrlHttps;
    @a("profile_link_color")
    public final String profileLinkColor;
    @a("profile_sidebar_border_color")
    public final String profileSidebarBorderColor;
    @a("profile_sidebar_fill_color")
    public final String profileSidebarFillColor;
    @a("profile_text_color")
    public final String profileTextColor;
    @a("profile_use_background_image")
    public final boolean profileUseBackgroundImage;
    @a("protected")
    public final boolean protectedUser;
    @a("screen_name")
    public final String screenName;
    @a("show_all_inline_media")
    public final boolean showAllInlineMedia;
    @a("status")
    public final Tweet status;
    @a("statuses_count")
    public final int statusesCount;
    @a("time_zone")
    public final String timeZone;
    @a("url")
    public final String url;
    @a("utc_offset")
    public final int utcOffset;
    @a("verified")
    public final boolean verified;
    @a("withheld_in_countries")
    public final List<String> withheldInCountries;
    @a("withheld_scope")
    public final String withheldScope;
    
    public User(final boolean contributorsEnabled, final String createdAt, final boolean defaultProfile, final boolean defaultProfileImage, final String description, final String email, final UserEntities entities, final int favouritesCount, final boolean followRequestSent, final int followersCount, final int friendsCount, final boolean geoEnabled, final long id, final String idStr, final boolean isTranslator, final String lang, final int listedCount, final String location, final String name, final String profileBackgroundColor, final String profileBackgroundImageUrl, final String profileBackgroundImageUrlHttps, final boolean profileBackgroundTile, final String profileBannerUrl, final String profileImageUrl, final String profileImageUrlHttps, final String profileLinkColor, final String profileSidebarBorderColor, final String profileSidebarFillColor, final String profileTextColor, final boolean profileUseBackgroundImage, final boolean protectedUser, final String screenName, final boolean showAllInlineMedia, final Tweet status, final int statusesCount, final String timeZone, final String url, final int utcOffset, final boolean verified, final List<String> withheldInCountries, final String withheldScope) {
        this.contributorsEnabled = contributorsEnabled;
        this.createdAt = createdAt;
        this.defaultProfile = defaultProfile;
        this.defaultProfileImage = defaultProfileImage;
        this.description = description;
        this.email = email;
        this.entities = entities;
        this.favouritesCount = favouritesCount;
        this.followRequestSent = followRequestSent;
        this.followersCount = followersCount;
        this.friendsCount = friendsCount;
        this.geoEnabled = geoEnabled;
        this.id = id;
        this.idStr = idStr;
        this.isTranslator = isTranslator;
        this.lang = lang;
        this.listedCount = listedCount;
        this.location = location;
        this.name = name;
        this.profileBackgroundColor = profileBackgroundColor;
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
        this.profileBackgroundTile = profileBackgroundTile;
        this.profileBannerUrl = profileBannerUrl;
        this.profileImageUrl = profileImageUrl;
        this.profileImageUrlHttps = profileImageUrlHttps;
        this.profileLinkColor = profileLinkColor;
        this.profileSidebarBorderColor = profileSidebarBorderColor;
        this.profileSidebarFillColor = profileSidebarFillColor;
        this.profileTextColor = profileTextColor;
        this.profileUseBackgroundImage = profileUseBackgroundImage;
        this.protectedUser = protectedUser;
        this.screenName = screenName;
        this.showAllInlineMedia = showAllInlineMedia;
        this.status = status;
        this.statusesCount = statusesCount;
        this.timeZone = timeZone;
        this.url = url;
        this.utcOffset = utcOffset;
        this.verified = verified;
        this.withheldInCountries = withheldInCountries;
        this.withheldScope = withheldScope;
    }
    
    public long getId() {
        return this.id;
    }
}
