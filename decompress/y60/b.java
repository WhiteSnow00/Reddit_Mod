// 
// Decompiled by Procyon v0.6.0
// 

package y60;

public final class b
{
    public static final a a;
    
    static {
        a = new a("90aa6b5ece5b", "ProfileDetailsByNames", "query ProfileDetailsByNames($profileNames: [String!]!) { profilesByNames(names:\n          $profileNames) { __typename ...profileDetailsFragment } } fragment\n          profileDetailsFragment on Profile { __typename redditorInfo { __typename ... on Redditor {\n          prefixedName } } id name styles { __typename legacyIcon { __typename url }\n          legacyPrimaryColor legacyBannerBackgroundImage icon } title description { __typename\n          markdown richtext } publicDescriptionText subscribersCount activeCount createdAt path\n          isNsfw whitelistStatus isQuarantined allowedPostTypes isChatPostCreationAllowed\n          isChatPostFeatureEnabled isSpoilerAvailable isPredictionAllowed isUserBanned isContributor\n          modPermissions { __typename isAllAllowed isAccessEnabled isConfigEditingAllowed\n          isFlairEditingAllowed isMailEditingAllowed isPostEditingAllowed isWikiEditingAllowed\n          isChatConfigEditingAllowed isChatOperator } isSubscribed isFavorite authorFlairSettings {\n          __typename isEnabled isSelfAssignable } authorFlair { __typename template { __typename id\n          backgroundColor textColor text richtext } } postFlairSettings { __typename isEnabled }\n          predictionLeaderboardEntryType isPredictionsTournamentAllowed }", 0);
    }
}
