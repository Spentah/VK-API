package api;

public enum EndPoints {

    GET_PROFILE_INFO("account.getProfileInfo"),
    SAVE_PROFILE_INFO("account.saveProfileInfo"),
    SAVE_PHOTO_ON_SERVER("photos.saveOwnerPhoto"),
    GET_PHOTO_UPLOAD_SERVER("photos.getOwnerPhotoUploadServer"),
    GET_DOCUMENT_TYPES("docs.getTypes"),
    GET_DOCS_UPLOAD_SERVER("docs.getUploadServer"),
    SAVE_DOCUMENT("docs.save"),
    GET_DOC_ID("docs.get"),
    EDIT_DOCUMENT("docs.edit"),
    DELETE_DOC("docs.delete"),
    GET_NEWSFEED("newsfeed.getRecommended"),
    ADD_LIKE("likes.add");

    public final String endPoint;

    EndPoints(String endPoint) {
        this.endPoint = endPoint;
    }

}
