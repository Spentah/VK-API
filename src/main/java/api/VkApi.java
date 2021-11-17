package api;

import io.qameta.allure.Step;

public class VkApi {

    private VkProfile profile = new VkProfile();
    private VkDocument document = new VkDocument();
    private VkNewsFeed newsFeed = new VkNewsFeed();
    private VkGroup group = new VkGroup();

    @Step("Получаем информацию о профиле")
    public VkApi getProfileInfo() {
        profile.getProfileInfo();
        return this;
    }

    @Step("Заполняем незаполненные поля в профиле")
    public VkApi saveProfileInfo() {
        profile.setProfileInfo(profile.findEmptyProfileInfo(), "api test");
        return this;
    }

    @Step("Загружаем фото профиля")
    public VkApi saveUploadPhoto() {
        profile.saveUploadedPhoto();
        return this;
    }

    @Step("Удостоверяемся, что можно загружать документы")
    public VkApi checkAvaibleType() {
        document.getDocumentType();
        return this;
    }

    @Step("Загружаем текстовый документ с именем '{documentName}'")
    public VkApi uploadDoc(String documentName) {
        document.saveDocument(documentName);
        return this;
    }

    @Step("Переименовываем загруженный документ именем '{newName}'")
    public VkApi renameDoc(String newName) {
        document.renameDocument(newName);
        return this;
    }

    @Step("Удаляем документ")
    public VkApi deleteDocument() {
        document.deleteDoc();
        return this;
    }

    @Step("Переходим в рекомендации")
    public VkApi getNewsFeed() {
        newsFeed.getRecommendedFeed();
        return this;
    }

    @Step("Ставим лайк на пост под номер '{number}' в рекомендациях")
    public VkApi likePost(int number) {
        newsFeed.like(number);
        return this;
    }

    @Step("Баним аккаунт под номером '{number}'")
    public VkApi banAccount(int number) {
        newsFeed.ban(number);
        return this;
    }

    @Step("Добавляем запись под номер '{number}' в закладки")
    public VkApi addToFav(int number) {
        newsFeed.addToFavorite(number);
        return this;
    }

    @Step("Создаем группу с названием '{title}'")
    public VkApi createGroup(String title) {
        group.createGroup(title);
        return this;
    }

    @Step("Создаем обсуждение с названием '{title}'")
    public VkApi createTopic(String title) {
        group.createTopic(title);
        return this;
    }

}
