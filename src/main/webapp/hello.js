$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/KnowledgeManagement/kelement/1092"
    }).then(function(data) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.content);
    });
});