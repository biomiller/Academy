const Validator = require("validator");
const isEmpty = require("./isEmpty");

module.exports = function validateUsername(data) {

    const errors = {};

    data.username = !isEmpty(data.username) ? data.username : "";

    if (Validator.isEmpty(data.username)) {
        errors.username = "Username is required.";
    }

    else if (!Validator.isAlphanumeric(data.username)){
        errors.username = "Username must only include numbers and letters.";
    }

    return {errors, isValid: isEmpty(errors)};
};

