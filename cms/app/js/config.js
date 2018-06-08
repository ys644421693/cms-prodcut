window.onload = function () {
    var mask = document.createElement("link");
    mask.setAttribute("rel", "shortcut icon");
    mask.setAttribute("href", "ico/favicon.ico");
    mask.setAttribute("type", "image/x-icon");
    document.head.appendChild(mask);
};
var config = {
    service: "http://localhost:8011"
};