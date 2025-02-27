import WatchingYou from "https://cdn.jsdelivr.net/npm/watching-you/dist/watching-you.js";

window.addEventListener("dwc-dialog-opened", e => {

  (async () => {
    await customElements.whenDefined('dwc-login');
    const login = document.getElementsByTagName("dwc-login")[0];
    login.componentOnReady().then(() => {
      console.log(login.shadowRoot);
      const eyes = document.querySelectorAll(".eye");
      const usernameInput = login.shadowRoot.querySelector("[part='username-input']");
      const passwordInput = login.shadowRoot.querySelector("[part='password-input']");
  
      const watcher1 = new WatchingYou("#eyeball1", {
        target: usernameInput,
        targetType: "input",
        power: { x: 15, y: 5 },
      });
  
      const watcher2 = new WatchingYou("#eyeball2", {
        target: usernameInput,
        targetType: "input",
        power: { x: 15, y: 5 },
      });
  
      const watcher3 = new WatchingYou("#eyeball1", {
        target: passwordInput,
        targetType: "input",
        power: { x: 15, y: 5 },
      });
  
      const watcher4 = new WatchingYou("#eyeball2", {
        target: passwordInput,
        targetType: "input",
        power: { x: 15, y: 5 },
      });
  
      watcher1.start();
      watcher2.start();
  
      passwordInput.addEventListener("focus", () => {
        eyes.forEach((eye) => eye.classList.add("closed"));
        watcher1.stop();
        watcher2.stop();
  
        watcher3.start();
        watcher4.start();
      });
  
      passwordInput.addEventListener("blur", () => {
        eyes.forEach((eye) => eye.classList.remove("closed"));
        watcher1.start();
        watcher2.start();
  
        watcher3.stop();
        watcher4.stop();
      });
    });
  })();
});
