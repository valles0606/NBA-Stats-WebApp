const searchButton = document.getElementById("search-button");
const playerInput = document.getElementById("search-input");
const resultsSection = document.getElementById("results-section");
const playerDetailSection = document.getElementById("player-detail-section");

searchButton.addEventListener("click", function() {
    const name = playerInput.value;
    resultsSection.innerHTML = "";
    playerDetailSection.innerHTML = "";

    if (name.trim() === "") {
        resultsSection.innerHTML = "<p>Please enter a player name.</p>";
        return;
    }

    fetch(`/players?name=${name}`)
        .then(response => response.json())
        .then(data => {
            data.forEach(player => {
                resultsSection.innerHTML += `
                    <div onclick="loadPlayer('${player.id}')">
                        <p>${player.fullName}</p>
                    </div>
                `;
            });
        });
});

function loadPlayer(id) {
    fetch(`/players/${id}`)
        .then(response => response.json())
        .then(data => {
            playerDetailSection.innerHTML = `
                <h2>${data.fullName}</h2>
                <p>Height: ${data.profile.height}</p>
                <p>Weight: ${data.profile.weight}</p>
                <p>Jersey: #${data.profile.jersey}</p>
                <p>Position: ${data.profile.position.main}</p>
                <p>Team: ${data.profile.team.displayName}</p>
                <div id="stats-section"><p>Loading stats...</p></div>
            `;

            fetch(`/players/${id}/statistics`)
                .then(response => response.json())
                .then(statsData => {
                    const statsSection = document.getElementById("stats-section");
                    let statsHtml = "<h3>Season Stats</h3>";
                    statsData.perSeason[0].stats.forEach(stat => {
                        statsHtml += `<p>${stat.name}: ${stat.value}</p>`;
                    });
                    statsSection.innerHTML = statsHtml;
                });
        });
}