const API_URL = "http://localhost:8090/students";

export async function getTodos() {
  const res = await fetch(API_URL);
  return res.json();
}

export async function addTodo(todo) {
  const res = await fetch(API_URL, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(todo),
  });
  return res.json();
}

export async function updateTodo(id, todo) {
  const res = await fetch(`${API_URL}/${id}`, {
    method: "PUT",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(todo),
  });
  return res.json();
}

export async function deleteTodo(id) {
  await fetch(`${API_URL}/${id}`, { method: "DELETE" });
}
