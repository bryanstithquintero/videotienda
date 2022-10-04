const loadUserConfig = () => {
    const loginLi = document.getElementById("login-link");
    const logoutLi = document.getElementById("logout-link");

    const user = localStorage.getItem("loggedUser");
    if (user == undefined) {
        loginLi.style.display = 'block';
        logoutLi.style.display = 'none';
    } else {
        loginLi.style.display = 'none';
        logoutLi.style.display = 'block';

        const userInfo = JSON.parse(user);
        document.getElementById("user-fullname").innerText = userInfo.name;
    }
};
const isAdmin = () => {
    const user = localStorage.getItem("loggedUser");
    if (user == undefined) {
        return false;
    }

    const userInfo = JSON.parse(user);
    return userInfo.admin;
};

loadUserConfig();

const logout = () => {
    localStorage.removeItem("loggedUser");

    loadUserConfig();
}

const updateCart = () => {
    let items = localStorage.getItem("cart");
    if (items == undefined) {
        items = new Map();
    } else {
        items = new Map(Object.entries(JSON.parse(items)));
    }

    const cartBadge = document.getElementById("cart-count");
    let total = 0;
    if (items.size > 0) {
        total = Array.from(items)
            .map(([key, value]) => value)
            .reduce((a, b) => a + b);
    }
    console.log("total", total);
    cartBadge.innerText = total;
}

updateCart();