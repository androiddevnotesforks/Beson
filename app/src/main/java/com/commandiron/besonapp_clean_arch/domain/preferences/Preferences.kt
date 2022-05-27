package com.commandiron.besonapp_clean_arch.domain.preferences

interface Preferences {
    fun saveShouldShowSplashAndIntro(shouldShow: Boolean)
    fun loadShouldShowSplashAndIntro(): Boolean
    fun saveTemporalSignUpStepsName(name: String)
    fun loadTemporalSignUpStepsName(): String
    fun saveTemporalSignUpStepsPhoneNumber(phoneNumber: String)
    fun loadTemporalSignUpStepsPhoneNumber(): String
    fun saveTemporalSignUpStepsPictureUriString(uri: String)
    fun loadTemporalSignUpStepsPictureUriString(): String?

    companion object {
        const val KEY_SHOULD_SHOW_SPLASH_AND_INTRO = "should_show_splash_and_intro"
        const val KEY_TEMPORAL_SIGN_UP_STEPS_NAME = "save_temporal_signUp_steps_name"
        const val KEY_TEMPORAL_SIGN_UP_STEPS_PHONE_NUMBER = "save_temporal_signUp_steps_phone_number"
        const val KEY_TEMPORAL_SIGN_UP_STEPS_PICTURE_URI = "save_temporal_signUp_steps_picture_uri"
    }
}