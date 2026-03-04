function editRow(btn){
    const id = btn.getAttribute("data-id");

    document.getElementById("year-text-" + id).style.display = "none";
    document.getElementById("year-input-" + id).style.display = "inline";
    document.getElementById("semester-text-" + id).style.display = "none";
    document.getElementById("semester-input-" + id).style.display = "inline";
    document.getElementById("name-text-" + id).style.display = "none";
    document.getElementById("name-input-" + id).style.display = "inline";
    document.getElementById("earned-credits-text-" + id).style.display = "none";
    document.getElementById("earned-credits-input-" + id).style.display = "inline";
    document.getElementById("subject-grade-text-" + id).style.display = "none";
    document.getElementById("subject-grade-input-" + id).style.display = "inline";
    document.getElementById("grade-point-text-" + id).style.display = "none";
    document.getElementById("grade-point-input-" + id).style.display = "inline";

    document.getElementById("save-btn-" + id).style.display = "inline";
    btn.style.display = "none";
}

function saveRow(btn){
    const id = btn.getAttribute("data-id");

    const yearInput = document.getElementById("year-input-" + id);
    const newYear = yearInput.value;
    const semesterInput = document.getElementById("semester-input-" + id);
    const newSemester = semesterInput.value;
    const nameInput = document.getElementById("name-input-" + id);
    const newName = nameInput.value;
    const earnedCreditsInput = document.getElementById("earned-credits-input-" + id);
    const newEarnedCredits = Number(earnedCreditsInput.value);
    const subjectGradeInput = document.getElementById("subject-grade-input-" + id);
    const newSubjectGrade = subjectGradeInput.value;
    const gradePointInput = document.getElementById("grade-point-input-" + id);
    const newGradePoint = Number(gradePointInput.value);

    const updateBtn = document.getElementById("updateBtn");

    fetch(`/score/update/${id}` , {
        method: "PATCH",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            year: newYear,
            semester: newSemester,
            name: newName,
            earnedCredits: newEarnedCredits,
            subjectGrade: newSubjectGrade,
            gradePoint: newGradePoint
        })
    })
        .then(res => {
            if(!res.ok) throw new Error("fail");
            return res.json();
        })
        .then(data => {
            document.getElementById("year-text-" + id).innerText = newYear;
            document.getElementById("year-text-" + id).style.display = "inline";
            yearInput.style.display = "none";
            document.getElementById("semester-text-" + id).innerText = newSemester;
            document.getElementById("semester-text-" + id).style.display = "inline";
            semesterInput.style.display = "none";
            document.getElementById("subject-id-text" + id).innerText = data.
            document.getElementById("name-text-" + id).innerText = newName;
            document.getElementById("name-text-" + id).style.display = "inline";
            nameInput.style.display = "none";
            document.getElementById("earned-credits-text-" + id).innerText = newEarnedCredits;
            document.getElementById("earned-credits-text-" + id).style.display = "inline";
            earnedCreditsInput.style.display = "none";
            document.getElementById("subject-grade-text-" + id).innerText = newSubjectGrade;
            document.getElementById("subject-grade-text-" + id).style.display = "inline";
            subjectGradeInput.style.display = "none";
            document.getElementById("grade-point-text-" + id).innerText = newGradePoint;
            document.getElementById("grade-point-text-" + id).style.display = "inline";
            gradePointInput.style.display = "none";

            btn.style.display = "none";
            updateBtn.style.display = "inline";
        })
}