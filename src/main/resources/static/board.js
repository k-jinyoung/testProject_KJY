//<방명록 등록>
const createBtn = document.getElementById("create-btn");
if (createBtn) {
    createButton.addEventListener("click", (event) => {
        fetch("/api/boards", {
            method: "POST",
            header: {
                "Content-Type" : "application/json",
            },
            body: JSON.stringify({
                writer: document.getElementById("writer").value,
                content: document.getElementById("content").value,
            }),
        }).then(() => {
            alert("방명록 등록이 완료되었습니다.");
            location.replace("/new-boards");
        });
    });
}